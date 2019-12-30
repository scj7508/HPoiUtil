package Poi.twostage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: HanXu
 * on 2019/12/27
 * Class description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private Integer depId;
    private String className;
    private String sno;
    private String name;
    private String year;
    private Float allAmountArrears;
    private Float amountArrears;
}
