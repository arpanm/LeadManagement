package com.jio.lead.management.domain;

import static com.jio.lead.management.domain.InterestTestSamples.*;
import static com.jio.lead.management.domain.LeadTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.jio.lead.management.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class LeadTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Lead.class);
        Lead lead1 = getLeadSample1();
        Lead lead2 = new Lead();
        assertThat(lead1).isNotEqualTo(lead2);

        lead2.setId(lead1.getId());
        assertThat(lead1).isEqualTo(lead2);

        lead2 = getLeadSample2();
        assertThat(lead1).isNotEqualTo(lead2);
    }

    @Test
    void interestTest() {
        Lead lead = getLeadRandomSampleGenerator();
        Interest interestBack = getInterestRandomSampleGenerator();

        lead.setInterest(interestBack);
        assertThat(lead.getInterest()).isEqualTo(interestBack);

        lead.interest(null);
        assertThat(lead.getInterest()).isNull();
    }
}
