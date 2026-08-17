.class public final synthetic La9/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/o;


# instance fields
.field public final synthetic g:La9/i;


# direct methods
.method public synthetic constructor <init>(La9/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La9/h;->g:La9/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La9/h;->g:La9/i;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p2, Li7/B;

    .line 6
    .line 7
    check-cast p3, Ln7/j;

    .line 8
    .line 9
    invoke-static {v0, p1, p2, p3}, La9/i;->d(La9/i;Ljava/lang/Throwable;Li7/B;Ln7/j;)Li7/B;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
