package org.springframework.social.facebook;

import java.util.Date;
import java.util.List;

public class Video {
	private String id;
	
	private Reference from;
	
	private List<Tag> tags; // optional
	
	private String name; // optional
	
	private String description; // optional
	
	private String picture;
	
	private String embedHtml;
	
	private String icon;
	
	private String source;
	
	private Date createdTime;
	
	private Date updatedTime;
	
	private Video(String id, Reference from, String picture, String embedHtml, String icon, String source, Date createdTime, Date updatedTime) {
		this.id = id;
		this.from = from;
		this.picture = picture;
		this.embedHtml = embedHtml;
		this.icon = icon;
		this.source = source;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}
	
	public String getId() {
		return id;
	}

	public Reference getFrom() {
		return from;
	}
	
	public List<Tag> getTags() {
		return tags;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public String getEmbedHtml() {
		return embedHtml;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public String getSource() {
		return source;
	}
	
	public Date getCreatedTime() {
		return createdTime;
	}
	
	public Date getUpdatedTime() {
		return updatedTime;
	}
	
	public static class Builder {
		private String id;
		
		private Reference from;
		
		private List<Tag> tags; // optional
		
		private String name; // optional
		
		private String description; // optional
		
		private String picture;
		
		private String embedHtml;
		
		private String icon;
		
		private String source;
		
		private Date createdTime;
		
		private Date updatedTime;
		
		public Builder(String id, Reference from, String picture, String embedHtml, String icon, String source, Date createdTime, Date updatedTime) {
			this.id = id;
			this.from = from;
			this.picture = picture;
			this.embedHtml = embedHtml;
			this.icon = icon;
			this.source = source;
			this.createdTime = createdTime;
			this.updatedTime = updatedTime;			
		}
		
		public Builder tags(List<Tag> tags) {
			this.tags = tags;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}
		
		public Video build() {
			Video video = new Video(id, from, picture, embedHtml, icon, source, createdTime, updatedTime);
			video.tags = tags;
			video.name = name;
			video.description = description;
			return video;
		}
}
}
