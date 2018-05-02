/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.example.chart.db.enums.MpaaRating;
import org.jooq.example.chart.db.tables.FilmList;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0",
        "schema version:public_2"
    },
    date = "2018-04-03T12:47:15.287Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmListRecord extends TableRecordImpl<FilmListRecord> implements Record8<Integer, String, String, String, BigDecimal, Integer, MpaaRating, String> {

    private static final long serialVersionUID = -1577279868;

    /**
     * Setter for <code>public.film_list.fid</code>.
     */
    public void setFid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_list.fid</code>.
     */
    public Integer getFid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.film_list.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film_list.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.film_list.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film_list.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.film_list.category</code>.
     */
    public void setCategory(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.film_list.category</code>.
     */
    public String getCategory() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.film_list.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.film_list.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.film_list.length</code>.
     */
    public void setLength(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.film_list.length</code>.
     */
    public Integer getLength() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.film_list.rating</code>.
     */
    public void setRating(MpaaRating value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.film_list.rating</code>.
     */
    public MpaaRating getRating() {
        return (MpaaRating) get(6);
    }

    /**
     * Setter for <code>public.film_list.actors</code>.
     */
    public void setActors(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.film_list.actors</code>.
     */
    public String getActors() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, BigDecimal, Integer, MpaaRating, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, BigDecimal, Integer, MpaaRating, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FilmList.FILM_LIST.FID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FilmList.FILM_LIST.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FilmList.FILM_LIST.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FilmList.FILM_LIST.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return FilmList.FILM_LIST.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return FilmList.FILM_LIST.LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MpaaRating> field7() {
        return FilmList.FILM_LIST.RATING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FilmList.FILM_LIST.ACTORS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpaaRating component7() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getActors();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpaaRating value7() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getActors();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value1(Integer value) {
        setFid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value4(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value5(BigDecimal value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value6(Integer value) {
        setLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value7(MpaaRating value) {
        setRating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value8(String value) {
        setActors(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord values(Integer value1, String value2, String value3, String value4, BigDecimal value5, Integer value6, MpaaRating value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmListRecord
     */
    public FilmListRecord() {
        super(FilmList.FILM_LIST);
    }

    /**
     * Create a detached, initialised FilmListRecord
     */
    public FilmListRecord(Integer fid, String title, String description, String category, BigDecimal price, Integer length, MpaaRating rating, String actors) {
        super(FilmList.FILM_LIST);

        set(0, fid);
        set(1, title);
        set(2, description);
        set(3, category);
        set(4, price);
        set(5, length);
        set(6, rating);
        set(7, actors);
    }
}
