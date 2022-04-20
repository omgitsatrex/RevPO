package org.example;


import java.util.*;

public class WeeklyCodingApr18 {
    public static void main(String[] args) {
        Set<String> projects = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        String[][] dependencies = {{"a", "d"}, {"f", "b"}, {"b", "d"}, {"f", "a"}, {"d", "c"}}; // Working dependency list
//        String[][] dependencies = {{"a", "d"}, {"f", "b"}, {"b", "d"}, {"f", "a"}, {"d", "c"}, {"c", "b"}};  // Circular dependencies check
//        String[][] dependencies = {{"a", "d"}, {"k", "b"}, {"b", "d"}, {"f", "a"}, {"d", "c"}}; // Foreign dependency check
        Set<String> output = new LinkedHashSet<>();

        try {
            for (String project :
                    projects) {
                output.addAll(getOutput(project, dependencies, projects.size() * 2, projects));
            }
            System.out.println(output);
        } catch (StackOverflowError | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Set<String> getOutput(String project, String[][] dependencies, int i, Set<String> projects) {

        if (i == 0) {
            throw new StackOverflowError("Stack overflow anticipated, ending method call");
        }
        if (!projects.contains(project)) {
            throw new NullPointerException("Following dependency not listed in projects: " + project);
        }

        Set<String> output = new LinkedHashSet<>();
        for (String[] dependency :
                dependencies) {
            if (project == dependency[1]) {
                output.addAll(getOutput(dependency[0], dependencies, i - 1, projects));
            }
        }
        output.add(project);
        return output;
    }
}

/*
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
*/

//public class Sandbox {
//    public static void main(String[] args) {
//        ArrayList<String> projects = new ArrayList<>(Arrays.asList("a","b","c","d","e","f"));
//
//        ArrayList<String[]> dependencies = new ArrayList<>(Arrays.asList({"a","d"}, {"f","d"}));
//        String[] test = {"a","b"};
//
//          System.out.println(dependencies.get(0).get(1);
//
//    }
//}

/*
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
public static void addToOutput(String project, List<ArrayList<String>> dependencies){
*/

//public class Sandbox {
//    public static void main(String[] args) {
//        List<String> projects = new ArrayList<>(Arrays.asList("a","b","c","d","e","f"));
//
//        //not using this, just proof of concept
////        List<String[]> dependencies2 = new ArrayList<>(Arrays.asList(new String[]{"a", "d"}, new String[]{"f", "d"}));
//
//
//        List<ArrayList<String>> dependencies = new ArrayList<>(Arrays.asList(
//                new ArrayList<>(Arrays.asList("a","d")),
//                new ArrayList<>(Arrays.asList("f","b")),
//                new ArrayList<>(Arrays.asList("b","d")),
//                new ArrayList<>(Arrays.asList("f","a")),
//                new ArrayList<>(Arrays.asList("d","c"))
//        ));
//
//        //will try converting array list to hash map later
//        //maybe even just rewrite it to be a map instead of a list
////        Map<String, HashSet<String>> dependenciesMap = new HashMap<>();
////
////        for (ArrayList<String> item:
////             dependencies) {
////            if(!dependenciesMap.containsKey(item.get(1))){
////                dependenciesMap.put(item.get(1), item.get(0));
////            }
////        }
//
//        //work in progress
//        for (String project:
//                projects) {
//            addToOutput(project, dependencies);
//        }
//
//
//        //legacy
////        addToOutput(projects.get(5), dependencies);
//
//        //testing outputs
////        System.out.println(dependencies2.get(0)[1]);
////        System.out.println(projects);
//        System.out.println(dependencies.get(3).get(1));
//    }
//
//    public static void addToOutput(String project, List<ArrayList<String>> dependencies){
//
//
//
//    }
//}