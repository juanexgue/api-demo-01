package com.juanex.apps.apidemo.dto;

import java.time.LocalDate;

public record CustomerRequest(
    String firstName,
    String lastName,
    LocalDate birthOfDate
) {
}
