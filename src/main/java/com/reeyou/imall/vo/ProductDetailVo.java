package com.reeyou.imall.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Reeyou
 * @data 2019/5/20 11:17
 */
@Getter
@Setter
public class ProductDetailVo {
	private Integer  id;
	private Integer categoryId;
	private String name;
	private String subtitle;
	private String mainImage;
	private String subImages;
	private String detail;
	private BigDecimal price;
	private Integer stock;
	private Integer status;
	private String createTime;
	private String updateTime;

	private String imageHost;
	private Integer parentCategoryId;
}
