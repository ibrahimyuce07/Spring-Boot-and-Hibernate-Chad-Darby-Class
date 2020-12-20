package com.hibernate.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "youtube_channel")
	private String youtubeChannel;

	@Column(name = "hobby")
	private String hobby;

	// add new field for instructor
	// @OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL) // her
	// iki tarafta da onetoone oldugu icin
	// bidirectional instructorDetail: diğer
	@OneToOne(mappedBy = "instructorDetail", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@ToString.Exclude // onetoone field adı
	private Instructor instructor;

	public InstructorDetail(String youtubeChannel, String hobby) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	public InstructorDetail() {
	}

	// annotate the class as an entity and map to database
	// annotate the fields with db column names
	// create constructors
	// generate getter/setters
	// generate toString

}
