.class public final synthetic Lcom/facebook/react/uimanager/events/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;


# instance fields
.field public final synthetic a:Lcom/facebook/react/uimanager/events/PointerEvent;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/events/PointerEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/g;->a:Lcom/facebook/react/uimanager/events/PointerEvent;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final match(ILjava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/g;->a:Lcom/facebook/react/uimanager/events/PointerEvent;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/facebook/react/uimanager/events/PointerEvent;->b(Lcom/facebook/react/uimanager/events/PointerEvent;ILjava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
