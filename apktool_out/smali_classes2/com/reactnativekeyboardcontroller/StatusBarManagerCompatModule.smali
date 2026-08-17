.class public final Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;
.super Lcom/reactnativekeyboardcontroller/NativeStatusBarManagerCompatSpec;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;",
        "Lcom/reactnativekeyboardcontroller/NativeStatusBarManagerCompatSpec;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "mReactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "",
        "getName",
        "()Ljava/lang/String;",
        "",
        "",
        "getConstants",
        "()Ljava/util/Map;",
        "",
        "hidden",
        "Li7/B;",
        "setHidden",
        "(Z)V",
        "",
        "color",
        "animated",
        "setColor",
        "(DZ)V",
        "translucent",
        "setTranslucent",
        "style",
        "setStyle",
        "(Ljava/lang/String;)V",
        "Lz6/f;",
        "module",
        "Lz6/f;",
        "react-native-keyboard-controller_release"
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
.field private final module:Lz6/f;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "mReactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/reactnativekeyboardcontroller/NativeStatusBarManagerCompatSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lz6/f;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lz6/f;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;->module:Lz6/f;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public getConstants()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;->module:Lz6/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/f;->f()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "StatusBarManager"

    .line 2
    .line 3
    return-object v0
.end method

.method public setColor(DZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;->module:Lz6/f;

    .line 2
    .line 3
    double-to-int p1, p1

    .line 4
    invoke-virtual {v0, p1, p3}, Lz6/f;->i(IZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setHidden(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;->module:Lz6/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz6/f;->l(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setStyle(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;->module:Lz6/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lz6/f;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTranslucent(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/StatusBarManagerCompatModule;->module:Lz6/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz6/f;->p(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
