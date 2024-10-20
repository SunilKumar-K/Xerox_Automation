package com.xerox_app.application.service;

import com.xerox_app.application.model.Order;
import com.xerox_app.application.model.PrintJob;
import com.xerox_app.application.model.PrintingOptions;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class XeroxService {

    private Map<String, PrintJob> printJobs = new HashMap<>();

    public PrintJob createPrintJob(Order order, MultipartFile file, PrintingOptions options) throws IOException {
        PrintJob printJob = new PrintJob();
        printJob.setOrderId(order.getOrderId());
        printJob.setFileName(file.getOriginalFilename());
        printJob.setFileContent(file.getBytes());
        printJob.setPrintingOptions(options);
        printJob.setStatus("Pending");

        printJobs.put(printJob.getPrintJobId(), printJob);
        return printJob;
    }

    public PrintJob getPrintJob(String printJobId) {
        return printJobs.get(printJobId);
    }

    public List<PrintJob> getPrintJobsByStatus(String status) {
        return printJobs.values().stream()
                .filter(job -> job.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public PrintJob updatePrintJobStatus(String printJobId, String newStatus) {
        PrintJob printJob = printJobs.get(printJobId);
        if (printJob != null) {
            printJob.setStatus(newStatus);
            // If status is "Completed", you might want to update the associated Order status
        }
        return printJob;
    }

    public double calculatePrintingCost(PrintingOptions options) {
        // Implement pricing logic based on number of pages, color/b&w, paper size, etc.
        double baseCost = options.isColor() ? 5.0 : 1.0;
        return baseCost * options.getNumberOfCopies() * options.getNumberOfPages();
    }

    public boolean validateFile(MultipartFile file) {
        // Implement file validation logic
        // Check file type, size, etc.
        String fileName = file.getOriginalFilename();
        long fileSize = file.getSize();

        // Example validation
        boolean validExtension = fileName != null &&
                (fileName.endsWith(".pdf") || fileName.endsWith(".docx") || fileName.endsWith(".jpg"));
        boolean validSize = fileSize > 0 && fileSize <= 10_000_000; // 10MB max

        return validExtension && validSize;
    }

    public void processPrintJob(String printJobId) {
        PrintJob job = printJobs.get(printJobId);
        if (job != null && "Pending".equals(job.getStatus())) {
            // Simulate print processing
            job.setStatus("Processing");
            // printing logic
            job.setStatus("Completed");
        }
    }

    public List<PrintJob> getQueuedJobs() {
        return getPrintJobsByStatus("Pending");
    }

    public void cancelPrintJob(String printJobId) {
        PrintJob job = printJobs.get(printJobId);
        if (job != null && !"Completed".equals(job.getStatus())) {
            job.setStatus("Cancelled");
        }
    }
}