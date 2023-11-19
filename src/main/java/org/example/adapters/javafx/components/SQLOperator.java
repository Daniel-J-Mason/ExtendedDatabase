package org.example.adapters.javafx.components;


import java.util.Arrays;
import java.util.stream.Collectors;

public enum SQLOperator {
    EQUALS,
    IN,
    CONTAINS,
    LESS_THAN,
    GREATER_THAN_OR_EQUAL,
    ENDS_WITH;
    
    public String toSQLCondition(String column, Object... args) {
        return switch (this) {
            case EQUALS -> "%s = %s".formatted(column, formatArg(args[0]));
            case IN -> "%s IN (%s)".formatted(column, formatArgsForIn(args));
            case CONTAINS -> "%s LIKE %%%s%%".formatted(column, formatArg(args[0]));
            case LESS_THAN -> "%s < %s".formatted(column, formatArg(args[0]));
            case GREATER_THAN_OR_EQUAL -> "%s >= %s".formatted(column, formatArg(args[0]));
            case ENDS_WITH -> "%s LIKE %%%s".formatted(column, formatArg(args[0]));
            default -> throw new IllegalArgumentException("Unsupported SQL Operator");
        };
    }
    
    private String formatArg(Object arg) {
        if (arg instanceof String stringArg) {
            return "'%s'".formatted(stringArg);
        }
        if (arg instanceof Number numberArg) {
            return numberArg.toString();
        }
        throw new IllegalArgumentException("Unsupported argument type");
    }
    
    private String formatArgsForIn(Object... args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("'IN' operation requires at least 1 argument");
        }
        return Arrays.stream(args)
                .map(this::formatArg)
                .collect(Collectors.joining(", "));
    }
}
