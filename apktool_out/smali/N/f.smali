.class public final synthetic LN/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:LN/g;


# direct methods
.method public synthetic constructor <init>(LN/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/f;->g:LN/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, LN/f;->g:LN/g;

    .line 2
    .line 3
    check-cast p1, LF/k1$f;

    .line 4
    .line 5
    check-cast p2, LF/k1$f;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, LN/g;->a(LN/g;LF/k1$f;LF/k1$f;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
