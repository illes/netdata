package org.firehol.netdata.module.jmx.query;

import org.firehol.netdata.model.Dimension;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MBeanQueryDimensionMapping {

	private Dimension dimension;
}
