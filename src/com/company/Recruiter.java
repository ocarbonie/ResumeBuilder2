package com.company;

import java.util.ArrayList;

public class Recruiter {
    ArrayList<Resume> person;

    public Recruiter() {
    }

    public Recruiter(ArrayList<Resume> person) {
        this.person = person;
    }

    public Resume getResume(int i) {
        return person.get(i);
    }

    public void setResume(Resume resume) {
        person.add(resume);
    }

//    public Resume searchResume(String word) {
////        int m = 0;
////        for (int i = 0; i < person.size(); i++) {
////            if (person.get(i).getSkills().equals(word)) {
////                m = i;
////            }
////            return person.get(m);
////        }
////    }
}


//            } else if (person.get(i).getEducation().equals(word)) {
//                m = i;
//            } else if (person.get(i).getExpericence().equals(word)) {
//                m = person.get(i);
//            } else if (person.get(i).getPersonal().equals(word)) {
//                m = person.get(i);
//            }
//        }
//        return m ;






