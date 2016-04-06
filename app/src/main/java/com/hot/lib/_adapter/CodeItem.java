package com.hot.lib._adapter;

/**
 * Created by alfredhot-DS on 2016-04-04.
 */
public class CodeItem {

    private int codeId;
    private String codeName= "";
    private String codeDes= "";
    private String codeGenDateStr= "";
    private String codeModDateStr= "";
    private long codeGenDateLong;
    private long codeModDateLong;

    private String codeLevel = "";
    private String codeLink = "";

    public String getCodeLink() {
        return codeLink;
    }

    public void setCodeLink(String codeLink) {
        this.codeLink = codeLink;
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

    public String getCodeGenDateStr() {
        return codeGenDateStr;
    }

    public void setCodeGenDateStr(String codeGenDateStr) {
        this.codeGenDateStr = codeGenDateStr;
    }

    public String getCodeModDateStr() {
        return codeModDateStr;
    }

    public void setCodeModDateStr(String codeModDateStr) {
        this.codeModDateStr = codeModDateStr;
    }

    public long getCodeGenDateLong() {
        return codeGenDateLong;
    }

    public void setCodeGenDateLong(long codeGenDateLong) {
        this.codeGenDateLong = codeGenDateLong;
    }

    public long getCodeModDateLong() {
        return codeModDateLong;
    }

    public void setCodeModDateLong(long codeModDateLong) {
        this.codeModDateLong = codeModDateLong;
    }
}
