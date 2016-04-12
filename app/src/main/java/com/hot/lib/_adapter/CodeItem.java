package com.hot.lib._adapter;

/**
 * Created by alfredhot-DS on 2016-04-04.
 */
public class CodeItem {

    private int codeId;
    private String codeName= "";
    private String codeDes= "";
    private String codeLevel = "";
    private String codePath = "";
    private boolean codeMark;

    public CodeItem(int codeId, String codeName, String codeDes, String codeLevel, String codePath, boolean codeMark) {
        this.codeId = codeId;
        this.codeName = codeName;
        this.codeDes = codeDes;
        this.codeLevel = codeLevel;
        this.codePath = codePath;
        this.codeMark = codeMark;
    }

    public String getCodePath() {
        return codePath;
    }

    public void setCodePath(String codePath) {
        this.codePath = codePath;
    }

    public String getCodeLevel() {
        return codeLevel;
    }

    public void setCodeLevel(String codeLevel) {
        this.codeLevel = codeLevel;
    }

    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getCodeDes() {
        return codeDes;
    }

    public void setCodeDes(String codeDes) {
        this.codeDes = codeDes;
    }

    public boolean isCodeMark() {
        return codeMark;
    }

    public void setCodeMark(boolean codeMark) {
        this.codeMark = codeMark;
    }

    public boolean toggleCodeMark()
    {
        setCodeMark(!isCodeMark());
        return isCodeMark();
    }

}
