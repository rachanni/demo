package com.security.demo.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "UserInfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements UserDetails {

	@Id
	@Column(unique = true, nullable = false)
	private int userId;

	@Column(unique = true, nullable = false)
	private String userName;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Date dateOfBirth;

	@Column(nullable = false)
	private String gender;

	@Column(nullable = false)
	private String address;

	@Column(unique = true, nullable = false)
	private String mobileNumber;

	@Column(unique = true, nullable = false)
	private String emailAddress;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Account account;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
