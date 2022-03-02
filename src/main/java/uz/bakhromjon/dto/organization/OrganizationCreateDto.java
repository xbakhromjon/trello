package uz.bakhromjon.dto.organization;

import uz.bakhromjon.dto.Dto;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class OrganizationCreateDto implements Dto {
    private String name;
    private MultipartFile logo;
    private String code;
    private String email;

    public OrganizationCreateDto(String name, MultipartFile logo, String code, String email) {
        this.name = name;
        this.code = code;
        this.email = email;
        this.logo = logo;
    }
}