package uz.bakhromjon.dto.auth;

import uz.bakhromjon.dto.GenericDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto extends GenericDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profile;
    private boolean active;
    private boolean blocked;
    private boolean isSuper;
    private Long organizationId;
    private Long roleId;

    @Builder(builderMethodName = "childBuilder")
    public UserDto(Long id,String firstName, String lastName, String email, String password, String profile, boolean active, boolean blocked, boolean isSuper, Long organizationId, Long roleId) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profile = profile;
        this.active = active;
        this.blocked = blocked;
        this.isSuper = isSuper;
        this.organizationId = organizationId;
        this.roleId = roleId;
    }
}
