package com.team2.actions;

import com.team2.shapes.Shape;

import java.awt.*;

public class ActionRecord {
    public enum ActionType { ADD, REMOVE, MOVE, COLOR_CHANGE }
    private ActionType type;
    private Shape shape;
    private Point previousPosition;
    private Color previousColor;

    public ActionRecord(ActionType type, Shape shape) {
        this.type = type;
        this.shape = shape;
    }

    public ActionRecord(ActionType type, Shape shape, Point previousPosition) {
        this.type = type;
        this.shape = shape;
        this.previousPosition = previousPosition;
    }

    public ActionRecord(ActionType type, Shape shape, Color previousColor) {
        this.type = type;
        this.shape = shape;
        this.previousColor = previousColor;
    }

    public ActionType getType() { return type; }
    public Shape getShape() { return shape; }
    public Point getPreviousPosition() { return previousPosition; }
    public Color getPreviousColor() { return previousColor; }
}
