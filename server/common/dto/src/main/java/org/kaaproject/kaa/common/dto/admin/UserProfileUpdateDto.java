/*
 * Copyright 2014-2016 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.common.dto.admin;

import org.kaaproject.kaa.common.dto.KaaAuthorityDto;

import java.io.Serializable;

public class UserProfileUpdateDto implements Serializable {

    private static final long serialVersionUID = 8016870008519720555L;

    private String username;
    private String firstName;
    private String lastName;
    private String mail;
    private KaaAuthorityDto authority;

    public UserProfileUpdateDto(String username, String firstName, String lastName, String mail, KaaAuthorityDto authority) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.authority = authority;
    }

    public UserProfileUpdateDto(UserDto userDto) {
        this.username = userDto.getUsername();
        this.firstName = userDto.getFirstName();
        this.lastName = userDto.getLastName();
        this.mail = userDto.getMail();
        this.authority = userDto.getAuthority();
    }

    public UserProfileUpdateDto() {
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public KaaAuthorityDto getAuthority() {
        return authority;
    }

    public void setAuthority(KaaAuthorityDto authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserProfileUpdateDto that = (UserProfileUpdateDto) o;

        if (!username.equals(that.username)) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!lastName.equals(that.lastName)) return false;
        return mail.equals(that.mail);

    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + mail.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UserProfileUpdateDto{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                ", authority=" + authority +
                '}';
    }
}
