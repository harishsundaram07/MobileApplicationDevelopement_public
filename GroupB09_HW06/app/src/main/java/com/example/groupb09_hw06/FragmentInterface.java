// Assignment : InClass 08
//File Name : GroupB09_InClass08
//Full name of the student : HARIKRISHNAN SUNDARAM  & MALHAR JOSHI


package com.example.groupb09_hw06;

public interface FragmentInterface {
    void goList(String uuid);

    void goRegister();

    void goHome();

    void gonewforum(User muser);

    void goDetails(String uuid,User user, Forum forum);
}
