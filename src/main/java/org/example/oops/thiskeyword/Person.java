package org.example.oops.thiskeyword;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@RequiredArgsConstructor
public class Person {
    private String name;
    private String email;
}
