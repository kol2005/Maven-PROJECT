package com.biz.sec.persistence;

import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class DetailDTO {

	private long d_seq;
	private long d_m_seq; // master table과 연계(Relation)을 수행하는 key
	private String d_subject;
	private String d_ok;
}
