package com.Rakhi;

public class LocalStudent extends Student {
    public LocalStudent(String id, String name, double cgpa) {
        super(id, name, cgpa);
    }

    @Override
    public void Show() {
        System.out.println("Local Student Information :");
        super.Show();
    }
}
