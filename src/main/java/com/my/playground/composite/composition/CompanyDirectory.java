package com.my.playground.composite.composition;

import com.my.playground.composite.interfaces.CompanyMember;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements CompanyMember {

    private final List<CompanyMember> member;

    public CompanyDirectory() {
        this.member = new ArrayList<>();
    }

    @Override
    public void showDetails() {
        for (CompanyMember member : member) {
            member.showDetails();
        }
    }

    public void addMember(CompanyMember member){
        this.member.add(member);
    }
}