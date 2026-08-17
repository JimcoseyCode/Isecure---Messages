.class public final Lexpo/modules/contacts/next/mappers/IsChangingAnythingKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "isChangingStructuredName",
        "",
        "Lexpo/modules/contacts/next/records/contact/PatchContactRecord;",
        "isChangingOrganization",
        "expo-contacts_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final isChangingOrganization(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getCompany()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getDepartment()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getJobTitle()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getPhoneticCompanyName()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 50
    return p0
.end method

.method public static final isChangingStructuredName(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getGivenName()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getMiddleName()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getFamilyName()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getPrefix()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getSuffix()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getPhoneticGivenName()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getPhoneticMiddleName()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    invoke-virtual {p0}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getPhoneticFamilyName()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-interface {p0}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    const/4 p0, 0x0

    .line 88
    return p0

    .line 89
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 90
    return p0
.end method
