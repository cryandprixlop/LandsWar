package ru.raskol.lands.model;

import java.util.EnumSet;
import java.util.Set;

/** Участник территории (старейшина или житель). Владелец хранится отдельно. */
public final class Member {

    public String uuid;
    public String name;
    public Rank rank = Rank.RESIDENT;
    public Set<PermFlag> flags = EnumSet.noneOf(PermFlag.class);

    public Member() {}

    public Member(String uuid, String name, Rank rank) {
        this.uuid = uuid;
        this.name = name;
        this.rank = rank;
    }

    public boolean has(PermFlag flag) {
        return flags.contains(flag);
    }
}
