package org.growersnation.site.dao;

import org.growersnation.site.model.ph.FeatureInfoResponse;
import org.growersnation.site.model.ph.PHBulkDensityFields;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PHBulkDensityDaoTest {

  @Test
  public void testJAXB() throws JAXBException {

    InputStream is = PHBulkDensityDaoTest.class.getResourceAsStream("/ph/test-nerc-topsoil-ph-1.xml");

    // Build JAXB the long way to get better error messages
    JAXBContext context = JAXBContext.newInstance(FeatureInfoResponse.class);

    FeatureInfoResponse fir = (FeatureInfoResponse) context.createUnmarshaller().unmarshal(is);

    assertEquals(1,fir.getFields().size());

    PHBulkDensityFields fields = fir.getFields().get(0);

    assertEquals("11.8",fields.getCnRatio1998());

  }

  @Test
  public void testLiveData() {

    PHBulkDensityDao testObject = new PHBulkDensityDao();

    List<PHBulkDensityFields> fields = testObject.getPHBulkDensityData(51.2, 0.1);

    assertEquals(1,fields.size());

    assertEquals("11.8",fields.get(0).getCnRatio1998());

  }


}
