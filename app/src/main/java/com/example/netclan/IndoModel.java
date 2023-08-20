package com.example.netclan;

public class IndoModel {
    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getAboutus() {
        return aboutus;
    }

    public void setAboutus(String aboutus) {
        this.aboutus = aboutus;
    }

    int img;
    String name;
    String profession;
    String range;
    int progress;
    String tags;
    String aboutus;

    public IndoModel(int img,String name,String profession,String range,int progress,
                    String tags,String aboutus){
        this.img=img;
        this.name=name;
        this.profession=profession;
        this.range=range;
        this.progress=progress;
        this.tags=tags;
        this.aboutus=aboutus;
    }

}
