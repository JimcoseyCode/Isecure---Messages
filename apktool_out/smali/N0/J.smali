.class public final LN0/J;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ln7/j$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN0/J$a;
    }
.end annotation


# static fields
.field public static final i:LN0/J$a;

.field private static final j:Ljava/lang/String;


# instance fields
.field private final g:LN0/J;

.field private final h:LN0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN0/J$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LN0/J$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LN0/J;->i:LN0/J$a;

    .line 8
    .line 9
    const-string v0, "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details."

    .line 10
    .line 11
    sput-object v0, LN0/J;->j:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(LN0/J;LN0/k;)V
    .locals 1

    .line 1
    const-string v0, "instance"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LN0/J;->g:LN0/J;

    .line 10
    .line 11
    iput-object p2, p0, LN0/J;->h:LN0/k;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public X(Ln7/j;)Ln7/j;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ln7/j$b$a;->d(Ln7/j$b;Ln7/j;)Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final a(LN0/i;)V
    .locals 1

    .line 1
    const-string v0, "candidate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN0/J;->h:LN0/k;

    .line 7
    .line 8
    if-eq v0, p1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LN0/J;->g:LN0/J;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, LN0/J;->a(LN0/i;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    sget-object v0, LN0/J;->j:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public e(Ln7/j$c;)Ln7/j$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ln7/j$b$a;->b(Ln7/j$b;Ln7/j$c;)Ln7/j$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getKey()Ln7/j$c;
    .locals 1

    .line 1
    sget-object v0, LN0/J$a$a;->g:LN0/J$a$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public u0(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ln7/j$b$a;->a(Ln7/j$b;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public y0(Ln7/j$c;)Ln7/j;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ln7/j$b$a;->c(Ln7/j$b;Ln7/j$c;)Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
