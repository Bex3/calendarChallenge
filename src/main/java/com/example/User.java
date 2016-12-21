package com.example;

import javax.persistence.*;

/**
 * Created by bearden-tellez on 12/21/16.
 */

    @Entity
    @Table(name = "users")

    public class User  {
        @Id
        @GeneratedValue
        int id;

        @Column(nullable = false)
        String firstName;

        @Column(nullable = false)
        String lastName;

        @Column(nullable = false, unique = true)
        String emailAddress;

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public int getId() {
                return id;
            }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public User(String firstName, String lastName, String emailAddress) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.emailAddress = emailAddress;
        }
    }

