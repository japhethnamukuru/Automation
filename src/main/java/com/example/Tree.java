package com.example;

enum TreeType {
    ORK,
    MUGUMO,
    BAOBAB,
    PALM
}

public class Tree {
    double heitghFt;
    double trunkDiameterInches;
    TreeType treeType;

    Tree ( double heitghFt, double trunkDiameterInches, TreeType treeType) {
        this.heitghFt = heitghFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow () {
        this.heitghFt = this.heitghFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 5;
    }
}
