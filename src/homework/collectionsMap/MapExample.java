package homework.collectionsMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> team = new HashMap<>();
        team.put(1, "axas");
        team.put(21, "azat");
        team.put(17, "karat");
        team.put(36, "mat");
        printAllMembers(team);

    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք
    // HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {

        Map<Integer, String> team = new HashMap<>();
        for (FootballTeamMember member : members) {
            team.put(member.number, member.name);
        }
        return team;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք
    // removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        boolean remove = memberMap.remove(removedNumber, memberMap.get(removedNumber));
        return remove;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        for (String value : memberMap.values()) {
            System.out.print(value + "  ");
        }

    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Map.Entry<Integer, String> stringEntry : memberMap.entrySet()) {
            System.out.println(stringEntry.getKey() + " - " + stringEntry.getValue());
        }


    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}