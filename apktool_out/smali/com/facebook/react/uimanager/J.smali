.class public final synthetic Lcom/facebook/react/uimanager/J;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/uimanager/ViewAtIndex;

    .line 2
    .line 3
    check-cast p2, Lcom/facebook/react/uimanager/ViewAtIndex;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/ViewAtIndex;->a(Lcom/facebook/react/uimanager/ViewAtIndex;Lcom/facebook/react/uimanager/ViewAtIndex;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
