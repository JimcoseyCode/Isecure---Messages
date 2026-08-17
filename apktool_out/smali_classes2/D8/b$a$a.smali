.class public final LD8/b$a$a;
.super LC8/u0$c$a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/b$a;->k0(LD8/b;LG8/j;)LC8/u0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/b;

.field final synthetic b:LC8/G0;


# direct methods
.method constructor <init>(LD8/b;LC8/G0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD8/b$a$a;->a:LD8/b;

    .line 2
    .line 3
    iput-object p2, p0, LD8/b$a$a;->b:LC8/G0;

    .line 4
    .line 5
    invoke-direct {p0}, LC8/u0$c$a;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LC8/u0;LG8/i;)LG8/j;
    .locals 2

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "type"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LD8/b$a$a;->a:LD8/b;

    .line 12
    .line 13
    iget-object v0, p0, LD8/b$a$a;->b:LC8/G0;

    .line 14
    .line 15
    invoke-interface {p1, p2}, LG8/o;->K(LG8/i;)LG8/j;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType"

    .line 20
    .line 21
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast p2, LC8/S;

    .line 25
    .line 26
    sget-object v1, LC8/N0;->k:LC8/N0;

    .line 27
    .line 28
    invoke-virtual {v0, p2, v1}, LC8/G0;->n(LC8/S;LC8/N0;)LC8/S;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const-string v0, "safeSubstitute(...)"

    .line 33
    .line 34
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, LD8/b;->a(LG8/i;)LG8/j;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method
