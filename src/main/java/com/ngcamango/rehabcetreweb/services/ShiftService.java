/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcetreweb.services;

import com.ngcamango.rehabcetreweb.domain.Shift;
import java.util.List;

/**
 *
 * @author ngcamango
 */
public interface ShiftService {
    public List<Shift> getShiftss(String shift);
}
