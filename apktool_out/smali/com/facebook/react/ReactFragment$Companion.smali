.class public final Lcom/facebook/react/ReactFragment$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/ReactFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0084T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0084T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0084T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\u00020\u00058\u0004X\u0085T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\t\u0010\u0003\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/facebook/react/ReactFragment$Companion;",
        "",
        "<init>",
        "()V",
        "ARG_COMPONENT_NAME",
        "",
        "ARG_LAUNCH_OPTIONS",
        "ARG_FABRIC_ENABLED",
        "ARG_DISABLE_HOST_LIFECYCLE_EVENTS",
        "getARG_DISABLE_HOST_LIFECYCLE_EVENTS$annotations",
        "newInstance",
        "Lcom/facebook/react/ReactFragment;",
        "componentName",
        "launchOptions",
        "Landroid/os/Bundle;",
        "fabricEnabled",
        "",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/ReactFragment$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$newInstance(Lcom/facebook/react/ReactFragment$Companion;Ljava/lang/String;Landroid/os/Bundle;Z)Lcom/facebook/react/ReactFragment;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/ReactFragment$Companion;->newInstance(Ljava/lang/String;Landroid/os/Bundle;Z)Lcom/facebook/react/ReactFragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method protected static synthetic getARG_DISABLE_HOST_LIFECYCLE_EVENTS$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final newInstance(Ljava/lang/String;Landroid/os/Bundle;Z)Lcom/facebook/react/ReactFragment;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "arg_component_name"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "arg_launch_options"

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "arg_fabric_enabled"

    .line 17
    .line 18
    invoke-virtual {v0, p1, p3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lcom/facebook/react/ReactFragment;

    .line 22
    .line 23
    invoke-direct {p1}, Lcom/facebook/react/ReactFragment;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    return-object p1
.end method
