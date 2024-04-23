package lang.object.equals;

import java.util.Objects;

public class UserV2 {
	
	private String id;

	public UserV2(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserV2 other = (UserV2) obj;
		return Objects.equals(id, other.id);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		UserV2 user = (UserV2)obj;
//		return id.equals(user.id);
//	}
	
}
