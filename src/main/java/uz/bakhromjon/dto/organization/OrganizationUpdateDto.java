package uz.bakhromjon.dto.organization;

import uz.bakhromjon.dto.GenericDto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationUpdateDto extends GenericDto {
    private String name;
    private String code;
    private String email;


    @Builder(builderMethodName = "childBuilder")
    public OrganizationUpdateDto(Long id, String name, String code, String email) {
        super(id);
        this.name = name;
        this.code = code;
        this.email = email;
    }
}