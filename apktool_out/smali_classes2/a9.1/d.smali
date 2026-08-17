.class public final synthetic La9/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/o;


# instance fields
.field public final synthetic g:La9/f;

.field public final synthetic h:La9/f$a;


# direct methods
.method public synthetic constructor <init>(La9/f;La9/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La9/d;->g:La9/f;

    .line 5
    .line 6
    iput-object p2, p0, La9/d;->h:La9/f$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La9/d;->g:La9/f;

    .line 2
    .line 3
    iget-object v1, p0, La9/d;->h:La9/f$a;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    check-cast p2, Li7/B;

    .line 8
    .line 9
    check-cast p3, Ln7/j;

    .line 10
    .line 11
    invoke-static {v0, v1, p1, p2, p3}, La9/f$a;->a(La9/f;La9/f$a;Ljava/lang/Throwable;Li7/B;Ln7/j;)Li7/B;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
