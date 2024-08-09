package com.scorpio4938.fantasia.core.politicaldivision;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PoliticalDivision {
    private UUID id;
    private String name;
    private DivisionType type;
    private List<PoliticalDivision> subdivisions;
    private int population;
    private double area;
    private int x, y, z; // Coordinates on a pixel map
    private String language;
    private String religion;
    private String customs;

    public PoliticalDivision(String name, DivisionType type, int population, double area, int x, int y, int z, String language, String religion, String customs) {
        this.name = name;
        this.type = type;
        this.population = population;
        this.area = area;
        this.x = x;
        this.y = y;
        this.z = z;
        this.language = language;
        this.religion = religion;
        this.customs = customs;
        this.subdivisions = new ArrayList<>();
    }

    public void addSubdivision(PoliticalDivision subdivision) {
        subdivisions.add(subdivision);
    }

    // Getters and setters
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DivisionType getType() {
        return type;
    }

    public void setType(DivisionType type) {
        this.type = type;
    }

    public List<PoliticalDivision> getSubdivisions() {
        return subdivisions;
    }

    public void setSubdivisions(List<PoliticalDivision> subdivisions) {
        this.subdivisions = subdivisions;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCustoms() {
        return customs;
    }

    public void setCustoms(String customs) {
        this.customs = customs;
    }

    @Override
    public String toString() {
        return "PoliticalDivision{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", population=" + population +
                ", area=" + area +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", language='" + language + '\'' +
                ", religion='" + religion + '\'' +
                ", customs='" + customs + '\'' +
                ", subdivisions=" + subdivisions +
                '}';
    }

    public enum DivisionType {
        KINGDOM, DUCHY, COUNTY, TOWN
    }
}
