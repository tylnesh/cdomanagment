package com.lordsoftech.cdomanagment.service;

import com.lordsoftech.cdomanagment.model.Printer;
import com.lordsoftech.cdomanagment.model.PrinterList;

public interface PrinterService {

    Printer savePrinter(Printer printer);
    Printer getPrinter(Long id);

    Integer updatePrinters(PrinterList updated);
    Integer deletePrinters(PrinterList deleted);



}
