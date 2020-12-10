package guru.springframework.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Null;
//import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

////    @Null
//    private UUID id;
//
////    @Null
//    private Integer version;
//
////    @Null
//    private OffsetDateTime createdDate;
//
////    @Null
//    private OffsetDateTime lastModifiedDate;
//
////    @NotBlank
//    private String beerName;
//
////    @NotNull
////    private BeerStyleEnum beerStyle;
//    private String beerStyle;
//
////    @Positive
////    @NotNull
//    private Long upc;
//
////    @Positive
////    @NotNull
//    private BigDecimal price;
//    private Integer minOnHand;
//    private Integer quantityToBrew;

    private UUID id;

    //    @Version
    private Long version;

    //    @CreationTimestamp
//    @Column(updatable = false)
    private Timestamp createdDate;

    //    @UpdateTimestamp
    private Timestamp lastModifiedDate;

    private String beerName;
    private BeerStyleEnum beerStyle;

    //    @Column(unique = true)
    private Long upc;

    private BigDecimal price;
    private Integer minOnHand;
    private Integer quantityToBrew;
}