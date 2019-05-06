package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Resume> candidates = new ArrayList<>();
        ArrayList<String> jobDescription = new ArrayList<>();
       //Resume person1 = new Resume();
        String oneMore = "Y";
        String enterInfo;
        String newPerson = "Y";
        int count = 0;
        String keyword= "";

        while(newPerson.equalsIgnoreCase("Y")) {
            candidates.add(new Resume());

            //Personal Information
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Phone: ");
            String phone = input.nextLine();

            PersonalInfo person = new PersonalInfo(name, email, phone);
            candidates.get(count).addPersonal(person);

            //Education Information
            enterInfo = "N";
            System.out.println("Would you like to enter any educational achievements? (y/n)");
            enterInfo = input.nextLine();

            if (enterInfo.equalsIgnoreCase("y")) {

                while (oneMore.equalsIgnoreCase("Y")) {
                    System.out.println("\nEducation Information");
                    System.out.print("School: ");
                    String schoolName = input.nextLine();

                    System.out.print("Degree earned at " + schoolName + ": ");
                    String degreeEarned = input.nextLine();

                    System.out.print("Major: ");
                    String major = input.nextLine();

                    System.out.print("Year graduated (i.e: xxxx): ");
                    int year = input.nextInt();
                    input.nextLine();

                    candidates.get(count).addEducation(new EducationalInfo(degreeEarned, major, schoolName, year));

                    System.out.println("Would you like to enter another degree?(y/n) ");
                    oneMore = input.nextLine();
                }
            }

            //Experience Information
            enterInfo = "N";

            System.out.println("Would you like to enter any Job Experience? (y/n)");
            enterInfo = input.nextLine();
            if (enterInfo.equalsIgnoreCase("y")) {
                oneMore = "Y";
                while (oneMore.equalsIgnoreCase("Y")) {
                    System.out.println("\nExperience");
                    System.out.print("Job Title: ");
                    String jobTitle = input.nextLine();

                    System.out.print("Company name: ");
                    String companyName = input.nextLine();

                    System.out.print("Date started(i.e: xx/xx/xxxx): ");
                    String dateStart = input.nextLine();

                    System.out.print("Date ended(i.e: xx/xx/xxxx): ");
                    String dateEnd = input.nextLine();

                    System.out.println("Job Description: ");
                    String jobDesc = input.nextLine();
                    jobDescription.add(jobDesc);

                    System.out.println("Please enter another job description for this position or press q: ");
                    String moreDesc = input.nextLine();


                    while (!moreDesc.equalsIgnoreCase("q")) {
                        jobDescription.add(moreDesc);
                        System.out.println("Please enter another job description for this position or press q: ");

                        if (!oneMore.equalsIgnoreCase("q")) {
                            moreDesc = input.nextLine();

                        }

                    }
                    candidates.get(count).addExpericence(new ExperienceInfo(companyName, jobTitle, dateStart, dateEnd, jobDescription));
                    System.out.println("\nWould you like to enter another experience?(y/n) ");
                    oneMore = input.nextLine();
                    jobDescription = new ArrayList<>();
                }
            }


            //Skills Information
            enterInfo = "N";

            System.out.println("Would you like to enter any skills? (y/n)");
            enterInfo = input.nextLine();
            if (enterInfo.equalsIgnoreCase("y")) {
                oneMore = "Y";
                oneMore = "Y";
                System.out.println("\nSkills");
                while (oneMore.equalsIgnoreCase("Y")) {
                    System.out.print("Skill name: ");
                    String skill = input.nextLine();

                    System.out.println("Choose proficiency rating for " + skill);
                    System.out.println("i.e: novice,fundamental, intermediate, advanced");
                    String rating = input.nextLine();

                    candidates.get(count).addSkills(new SkillsInfo(skill, rating));

                    System.out.println("\nWould you like to enter another skill(y/n)? ");
                    oneMore = input.nextLine();
                }
            }

           // candidates.get(count).printResume();


            System.out.println("\n\nDo you want to enter another person?(y/n)");
            newPerson = input.nextLine();
            count++;
        }
        for(int i=0; i<candidates.size();i++) {
            candidates.get(i).printResume();
        }

//        Recruiter recruiterAgent = new Recruiter(candidates);
//
//        System.out.println("Welcome to the recruiter search engine");
//        System.out.println("Please enter a keyword: ");
//        keyword = input.nextLine();
//
//        System.out.println(recruiterAgent.searchResume(keyword));

            }
        }


