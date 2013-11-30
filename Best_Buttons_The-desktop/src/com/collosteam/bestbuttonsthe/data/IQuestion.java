package com.collosteam.bestbuttonsthe.data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Miroshnychenko Andre
 * Date: 22.11.13
 * Time: 19:58
 * Contein all uses public metods needed from to read and write game questiondata
 */
public interface IQuestion extends Serializable {

    long serialVersionUID = 1L;

    public int getGroup();

    public String getQuestion();

    public String getAnsver();

    public String getWeigth();

    public String getVersion();


}
