package org.liferay.portlet.restconsumer.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Note. This utility wraps
 * {@link org.liferay.portlet.restconsumer.service.impl.NoteLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NoteLocalService
 * @see org.liferay.portlet.restconsumer.service.base.NoteLocalServiceBaseImpl
 * @see org.liferay.portlet.restconsumer.service.impl.NoteLocalServiceImpl
 * @generated
 */
public class NoteLocalServiceUtil {
    private static NoteLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link org.liferay.portlet.restconsumer.service.impl.NoteLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<org.liferay.portlet.restconsumer.service.Note> findNotes() {
        return getService().findNotes();
    }

    public static void clearService() {
        _service = null;
    }

    public static NoteLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    NoteLocalService.class.getName());

            if (invokableLocalService instanceof NoteLocalService) {
                _service = (NoteLocalService) invokableLocalService;
            } else {
                _service = new NoteLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(NoteLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(NoteLocalService service) {
    }
}
