.class public abstract Lexpo/modules/contacts/next/domain/model/event/EventLabel;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/contacts/next/domain/model/event/EventLabel$Anniversary;,
        Lexpo/modules/contacts/next/domain/model/event/EventLabel$Birthday;,
        Lexpo/modules/contacts/next/domain/model/event/EventLabel$Custom;,
        Lexpo/modules/contacts/next/domain/model/event/EventLabel$Other;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u000c\r\u000e\u000fB\u001d\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/event/EventLabel;",
        "",
        "type",
        "",
        "label",
        "",
        "<init>",
        "(ILjava/lang/String;)V",
        "getType",
        "()I",
        "getLabel",
        "()Ljava/lang/String;",
        "Anniversary",
        "Birthday",
        "Other",
        "Custom",
        "Lexpo/modules/contacts/next/domain/model/event/EventLabel$Anniversary;",
        "Lexpo/modules/contacts/next/domain/model/event/EventLabel$Birthday;",
        "Lexpo/modules/contacts/next/domain/model/event/EventLabel$Custom;",
        "Lexpo/modules/contacts/next/domain/model/event/EventLabel$Other;",
        "expo-contacts_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final label:Ljava/lang/String;

.field private final type:I


# direct methods
.method private constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lexpo/modules/contacts/next/domain/model/event/EventLabel;->type:I

    iput-object p2, p0, Lexpo/modules/contacts/next/domain/model/event/EventLabel;->label:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    move-object p2, p4

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2, p4}, Lexpo/modules/contacts/next/domain/model/event/EventLabel;-><init>(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/contacts/next/domain/model/event/EventLabel;-><init>(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/event/EventLabel;->label:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/contacts/next/domain/model/event/EventLabel;->type:I

    .line 2
    .line 3
    return v0
.end method
