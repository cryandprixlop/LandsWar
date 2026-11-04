package ru.raskol.lands.model;

/** Флаги разрешений, которые владелец выдаёт вручную. */
public enum PermFlag {

    BUILD,
    BREAK,
    CONTAINERS;

    public static PermFlag byName(String name) {
        if (name == null) return null;
        try {
            return valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
