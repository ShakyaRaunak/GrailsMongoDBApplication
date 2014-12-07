package com.rkshakyaprojects.grailsmongodb

class Person {

    static mapWith = "mongo"

    String firstName
    String lastName
    //Address address

    //static embedded = ['address']

    static mapping = {
        collection "personcollection"
        database "grailsmongodbappdb"
    }
}