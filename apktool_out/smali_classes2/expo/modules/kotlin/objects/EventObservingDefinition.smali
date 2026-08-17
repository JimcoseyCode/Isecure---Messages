.class public final Lexpo/modules/kotlin/objects/EventObservingDefinition;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/objects/EventObservingDefinition$AllEventsFilter;,
        Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;,
        Lexpo/modules/kotlin/objects/EventObservingDefinition$SelectedEventFiler;,
        Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0015R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0016\u00a8\u0006\u001b"
    }
    d2 = {
        "Lexpo/modules/kotlin/objects/EventObservingDefinition;",
        "",
        "Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;",
        "type",
        "Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;",
        "filer",
        "Lkotlin/Function0;",
        "Li7/B;",
        "body",
        "<init>",
        "(Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;Lw7/a;)V",
        "",
        "eventName",
        "",
        "shouldBeInvoked$expo_modules_core_release",
        "(Ljava/lang/String;)Z",
        "shouldBeInvoked",
        "eventType",
        "invokedIfNeed",
        "(Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;Ljava/lang/String;)V",
        "Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;",
        "Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;",
        "Lw7/a;",
        "Type",
        "Filter",
        "AllEventsFilter",
        "SelectedEventFiler",
        "expo-modules-core_release"
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
.field private final body:Lw7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw7/a;"
        }
    .end annotation
.end field

.field private final filer:Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;

.field private final type:Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;Lw7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;",
            "Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;",
            "Lw7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "body"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lexpo/modules/kotlin/objects/EventObservingDefinition;->type:Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;

    .line 20
    .line 21
    iput-object p2, p0, Lexpo/modules/kotlin/objects/EventObservingDefinition;->filer:Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;

    .line 22
    .line 23
    iput-object p3, p0, Lexpo/modules/kotlin/objects/EventObservingDefinition;->body:Lw7/a;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final invokedIfNeed(Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "eventType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lexpo/modules/kotlin/objects/EventObservingDefinition;->type:Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Lexpo/modules/kotlin/objects/EventObservingDefinition;->shouldBeInvoked$expo_modules_core_release(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lexpo/modules/kotlin/objects/EventObservingDefinition;->body:Lw7/a;

    .line 22
    .line 23
    invoke-interface {p1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final shouldBeInvoked$expo_modules_core_release(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/objects/EventObservingDefinition;->filer:Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;

    .line 7
    .line 8
    instance-of v1, v0, Lexpo/modules/kotlin/objects/EventObservingDefinition$AllEventsFilter;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    instance-of v1, v0, Lexpo/modules/kotlin/objects/EventObservingDefinition$SelectedEventFiler;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast v0, Lexpo/modules/kotlin/objects/EventObservingDefinition$SelectedEventFiler;

    .line 19
    .line 20
    invoke-virtual {v0}, Lexpo/modules/kotlin/objects/EventObservingDefinition$SelectedEventFiler;->getEvent()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_1
    new-instance p1, Li7/m;

    .line 30
    .line 31
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 32
    .line 33
    .line 34
    throw p1
.end method
