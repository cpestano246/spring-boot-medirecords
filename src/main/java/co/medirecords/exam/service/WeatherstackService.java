package co.medirecords.exam.service;

import co.medirecords.exam.objects.WeatherstackResponse;

public interface WeatherstackService {

    WeatherstackResponse getCurrent(String location);
}
